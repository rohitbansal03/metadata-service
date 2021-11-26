package org.boot.services.metadata.repository;

import org.boot.services.metadata.model.Metadata;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.stream.Stream;

@Repository
public interface MetadataRepository extends MongoRepository<Metadata, ObjectId> {

    Optional<Metadata> findById(ObjectId id);

    Optional<Metadata> findByGroupAndName(String group, String name);

    Stream<Metadata> findByGroup(String group);
}
