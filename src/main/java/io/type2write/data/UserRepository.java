package io.type2write.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, String> {
    UserEntity findByFirstName (String firstName);
    void deleteByFirstName (String firstName);
}
