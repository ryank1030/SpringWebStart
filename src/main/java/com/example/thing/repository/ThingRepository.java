package com.example.thing.repository;

import com.example.thing.entity.Thing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ThingRepository extends JpaRepository<Thing, UUID>, JpaSpecificationExecutor<Thing> {

}
