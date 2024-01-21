package org.zwang.domain.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Date {

    private LocalDate date;
}
