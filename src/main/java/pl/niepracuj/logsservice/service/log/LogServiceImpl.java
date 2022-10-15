package pl.niepracuj.logsservice.service.log;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.niepracuj.logsservice.model.Log;
import pl.niepracuj.logsservice.model.LogDto;
import pl.niepracuj.logsservice.mapper.LogMapper;
import pl.niepracuj.logsservice.repository.LogRepository;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class LogServiceImpl implements LogService {

    private final LogMapper logMapper;

    private final LogRepository logRepository;

    @Override
    public LogDto saveLog(LogDto logDto) {
        Log log = logMapper.logDtoToLog(logDto);
        return logMapper.logToLogDto(logRepository.save(log));
    }
}