package io.type2write.services;

import io.type2write.mappers.EntityMapper;
import io.type2write.data.UserEntity;
import io.type2write.data.UserRepository;
import io.type2write.model.UserModel;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final TimeService timeService;
    private final UserRepository userRepository;
    private final EntityMapper<UserEntity, UserModel> entityMapper;

    public UserServiceImpl(TimeService timeService, UserRepository userRepository, EntityMapper<UserEntity, UserModel> entityMapper) {
        this.timeService = timeService;
        this.userRepository = userRepository;
        this.entityMapper = entityMapper;
    }
    public UserModel getUser(String userName) {
        return entityMapper.map(userRepository.findByFirstName(userName));
    }
    public void addUser(UserModel user) {
        user.setCreationTime(timeService.getCurrentTime("Amsterdam"));
        userRepository.save(entityMapper.reverseMap(user));
    }
    public void deleteUser(String userName) {
       userRepository.deleteByFirstName(userName);
    }
}
