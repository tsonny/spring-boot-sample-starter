package io.type2write.mappers;

public interface EntityMapper<T, U> {
    U map(T entity);
    T reverseMap(U entity);
}
