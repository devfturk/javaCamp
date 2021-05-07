package nLayeredeCommerceSimulation.business.abstracts;

import nLayeredeCommerceSimulation.entities.concretes.User;

public interface UserValidationService {
    boolean validate(User user);
}
