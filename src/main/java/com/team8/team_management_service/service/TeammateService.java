package com.team8.team_management_service.service;

import com.team8.team_management_service.dto.TeammateDto;
import com.team8.team_management_service.entity.Team;
import com.team8.team_management_service.entity.TeammateRole;

import java.util.List;

public interface TeammateService {

    // Получение участника по идентификатору участника
    TeammateDto findById(Long teammateId);

    // Получение всех участников команды
    List<TeammateDto> findAll(Long teamId);

    // Создание участника в команде
    TeammateDto create(Long teamId, Long userId, TeammateRole role);

    // Частичное обновление участника команды
    TeammateDto partialUpdate(TeammateDto teammateDto, Long teammateId);

    List<Team> findTeamsByUserId(Long userId);

    TeammateDto update(Long teamId, Long teammateId, TeammateDto teammateDto);

    void delete(Long teamId, Long teammateId);
}