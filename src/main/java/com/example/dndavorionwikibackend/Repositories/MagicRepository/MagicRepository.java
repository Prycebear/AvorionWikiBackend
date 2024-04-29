package com.example.dndavorionwikibackend.Repositories.MagicRepository;

import com.example.dndavorionwikibackend.Model.Magic.Magic;
import com.example.dndavorionwikibackend.Model.Species.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagicRepository extends JpaRepository<Magic, Long> {

    Magic findMagicByMagicId(long magicId);

    Magic findMagicByMagicName(String magicName);


}
