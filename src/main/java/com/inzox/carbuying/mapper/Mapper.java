package com.inzox.carbuying.mapper;
import java.util.*;
import java.util.stream.Collectors;

public interface Mapper <E, D>{
    E toEntity(D dto);
    D toDTO(E entity);

    default List<E> toEntity(List<D> dtos) {
        return dtos.stream().map(this::toEntity).collect(Collectors.toList());
    }
    default List<D> toDTO(List<E> dtos) {
        return dtos.stream().map(this::toDTO).collect(Collectors.toList());
    }
}
