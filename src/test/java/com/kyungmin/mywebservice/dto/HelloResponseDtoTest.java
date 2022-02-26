package com.kyungmin.mywebservice.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
        //assertThat(): assertj(테스트 검증 라이브러리)의 검증 메서드, 검증하고 싶은 대상을 메서드 인자로 받음
        //isEqualTo(): assertj의 동등 비교 메서드
    }
}
