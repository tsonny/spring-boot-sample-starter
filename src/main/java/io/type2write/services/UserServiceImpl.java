package io.type2write.services;

import org.springframework.stereotype.Service;
import io.type2write.data.UserEntity;
import io.type2write.data.UserRepository;
import io.type2write.mappers.EntityMapper;
import io.type2write.model.UserModel;

import javax.transaction.Transactional;


@Service
public class UserServiceImpl implements UserService {

    private final TimeService timeService;
    private final EntityMapper<UserEntity, UserModel> entityMapper;
    private final UserRepository userRepository;

    public UserServiceImpl(TimeService timeService, EntityMapper<UserEntity, UserModel> entityMapper, UserRepository userRepository) {
        this.timeService = timeService;
        this.entityMapper = entityMapper;
        this.userRepository = userRepository;
    }

    public UserModel getUser(String userName) {
        return entityMapper.map(userRepository.findByFirstName(userName));
    }

    public void addUser(UserModel user) {
        user.setCreationTime(timeService.getCurrentTime("Amsterdam"));
        userRepository.save(entityMapper.reverseMap(user));
    }

    @Transactional
    public void deleteUser(String userName){
        userRepository.deleteByFirstName(userName);
    }
}
