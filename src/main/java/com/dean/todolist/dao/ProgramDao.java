package com.dean.todolist.dao;

import com.dean.todolist.entity.ProgramEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface ProgramDao {

    List<ProgramEntity> findProgram(ProgramEntity programEntity);

    ProgramEntity findProgramById(Long id);

    void saveProgram(ProgramEntity programEntity);

    void updateProgram(ProgramEntity programEntity);

    void deleteProgram(ProgramEntity programEntity);
}
