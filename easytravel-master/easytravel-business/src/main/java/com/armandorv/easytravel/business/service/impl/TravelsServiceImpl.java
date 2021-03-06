package com.armandorv.easytravel.business.service.impl;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.armandorv.easytravel.business.domain.Destiny;
import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.business.domain.User;
import com.armandorv.easytravel.business.exception.BusinessException;
import com.armandorv.easytravel.business.repository.DestinyRepository;
import com.armandorv.easytravel.business.repository.TravelRepository;
import com.armandorv.easytravel.business.repository.UserRepository;
import com.armandorv.easytravel.business.service.LogisticsService;
import com.armandorv.easytravel.business.service.TravelsService;
import com.armandorv.easytravel.business.service.impl.commands.FindByTermCommand;
import com.armandorv.easytravel.business.service.impl.commands.HasVisitedCommand;
import com.armandorv.easytravel.business.service.impl.commands.MostVisitedDestinationsCommand;
import com.armandorv.easytravel.business.service.impl.commands.TravelsByDestinationCommand;

@Service
@Transactional
class TravelsServiceImpl implements TravelsService {

	private static Logger log = Logger.getLogger(TravelsServiceImpl.class);

	@Autowired
	private LogisticsService logisticsManager;

	@Autowired
	private TravelRepository travelRepository;

	@Autowired
	private DestinyRepository destinyRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public void createTravel(String username, Travel travel,
			List<Destiny> destinies) throws BusinessException {
		log.debug("Creating a new travel " + travel);

		travel = travelRepository.save(travel);
		User user = user(username);
		user.addTravel(travel);

		Iterable<Destiny> persistentDestinies = destinyRepository
				.save(destinies);

		for (Destiny destiny : persistentDestinies) {
			travel.addDestiny(destiny);
		}
	}

	@Override
	public Iterable<Travel> getTravels(String username)
			throws BusinessException {
		User user = user(username);
		return travelRepository.findByUser(user);
	}

	@Override
	public Iterable<Travel> getTravels() throws BusinessException {
		return travelRepository.findAll();
	}

	@Override
	public void removeTravel(Travel travel) throws BusinessException {
		travelRepository.delete(travel.getId());
	}

	@Override
	public void summarizeTravel(Travel selected) throws BusinessException {
		Travel travel = travel(selected.getId());
		travel.setSummary(selected.getSummary());
		travel.markAsDone();
	}

	private User user(String username) throws BusinessException {
		User user = userRepository.findByUsername(username);
		if (user == null) {
			throw new BusinessException("The username is not in the system.");
		}
		return user;
	}

	private Travel travel(Long id) throws BusinessException {
		Travel travel = travelRepository.findOne(id);
		if (travel == null) {
			throw new BusinessException("The trave has been deleted.");
		}
		return travel;
	}

	@Override
	public Set<Destiny> getDestinies(Long id) throws BusinessException {
		Travel travel = travel(id);
		travel.getDestinies().size();
		return travel.getDestinies();
	}

	@Override
	public int getTravelsByDestination(String destinyName) {
		return new TravelsByDestinationCommand(travelRepository,
				destinyRepository).execute(destinyName);
	}

	@Override
	public Destiny getMostVisitedDestination() {
		List<Destiny> dests = new MostVisitedDestinationsCommand(
				travelRepository, destinyRepository).execute(1);
		return (dests.size() > 0) ? dests.get(0) : null;
	}

	@Override
	public List<Destiny> getMostVisitedDestinations(int max) {
		return new MostVisitedDestinationsCommand(travelRepository,
				destinyRepository).execute(max);
	}

	@Override
	public Collection<Travel> getTravelsByTerm(String term) {
		Iterable<Travel> travels = travelRepository.findAll();
		return new FindByTermCommand(travels).execute(term);
	}

	@Override
	public boolean hasUserVisited(String username, String destinyName) {
		User user = userRepository.findByUsername(username);
		Iterable<Travel> userTravels = travelRepository.findByUser(user);
		return new HasVisitedCommand(userTravels).execute(destinyName);
	}

}