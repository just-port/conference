package com.pluralsight.conference.repository;

import java.util.List;

import com.pluralsight.conference.model.Speaker;

public interface SpeakerRepository {
    List<Speaker> findAll();
}