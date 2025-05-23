package com.artu.fullstack_team_project_application.service.event;

import com.artu.fullstack_team_project_application.entity.events.event.EventImage;
import com.artu.fullstack_team_project_application.repository.event.EventImagesRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventImagesServiceImp implements EventImagesService {

    @Autowired
    private final EventImagesRepository eventImagesRepository;

    public  EventImagesServiceImp(EventImagesRepository eventImagesRepository) {
        this.eventImagesRepository = eventImagesRepository;
    }

    public List<EventImage> getEventImagesByEventId(int eventId) {
        return eventImagesRepository.findByEventId(eventId);
    }
}
