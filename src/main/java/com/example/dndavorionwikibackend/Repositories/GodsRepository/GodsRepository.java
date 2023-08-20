package com.example.dndavorionwikibackend.Repositories.GodsRepository;

import com.example.dndavorionwikibackend.Model.Gods.Gods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GodsRepository extends JpaRepository<Gods, Long> {


}
