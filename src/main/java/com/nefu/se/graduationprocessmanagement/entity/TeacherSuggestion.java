package com.nefu.se.graduationprocessmanagement.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("teacher_suggestion")
public class TeacherSuggestion {
    private Long id;

    private Long teacherId;

    private Long studentId;

    private Long taskId;

    private String suggestion;

    private LocalDateTime updateTime;
}