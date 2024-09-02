package ru.job4j.grabber.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import java.time.LocalDateTime;

class HabrCareerDateTimeParserTest {

    @Test
    void parseFirst() {
        String date = "2024-08-26T13:32:42+03:00";
        HabrCareerDateTimeParser parser = new HabrCareerDateTimeParser();
        LocalDateTime result = parser.parse(date);
        assertThat(result).isEqualTo("2024-08-26T13:32:42");
    }

    @Test
    void parseSecond() {
        String date = "2024-09-01T11:27:44+03:00";
        HabrCareerDateTimeParser parser = new HabrCareerDateTimeParser();
        LocalDateTime result = parser.parse(date);
        assertThat(result).isEqualTo("2024-09-01T11:27:44");
    }
}