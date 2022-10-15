package pl.niepracuj.logsservice.mapper;

import org.springframework.stereotype.Component;
import pl.niepracuj.logsservice.model.Log;
import pl.niepracuj.logsservice.model.LogDto;

@Component
public class LogMapper {

    public LogDto toDto(Log log){
        return LogDto.builder()
                .id(log.getId())
                .loggedOn(log.getLoggedOn())
                .message(log.getMessage())
                .build();
    }
    public Log toNewEntity(LogDto logDto){
        return  Log.builder()
                .loggedOn(logDto.getLoggedOn())
                .message(logDto.getMessage())
                .build();
    }
}