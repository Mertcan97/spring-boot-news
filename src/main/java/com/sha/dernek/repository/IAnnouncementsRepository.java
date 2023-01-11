package com.sha.dernek.repository;

import com.sha.dernek.model.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAnnouncementsRepository extends JpaRepository<Announcement, Long>
{
}
