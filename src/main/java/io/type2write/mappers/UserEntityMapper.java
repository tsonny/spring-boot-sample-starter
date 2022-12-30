package io.type2write.mappers;

import org.springframework.stereotype.Component;
import io.type2write.data.UserEntity;
import io.type2write.model.UserModel;

@Component
public class UserEntityMapper implements EntityMapper<UserEntity, UserModel> {

    @Override
    public UserModel map(UserEntity entity) {
        return new UserModel(
                entity.getFirstName(),
                entity.getLastName(),
                entity.getMemberId(),
                entity.getCreationTime()
        );
    }

    @Override
    public UserEntity reverseMap(UserModel entity) {
        return new UserEntity(
                entity.getFirstName(),
                entity.getLastName(),
                entity.getMemberId(),
                entity.getCreationTime()
        );
    }
}
