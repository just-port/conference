package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Justin");
        speaker.setLastName("Portell");

        speakers.add(speaker);

        return speakers;
    }
}