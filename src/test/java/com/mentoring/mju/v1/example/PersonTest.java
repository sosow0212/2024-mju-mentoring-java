package com.mentoring.mju.v1.example;

import com.mentoring.mju.v1.example.Person;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@SuppressWarnings("NonAsciiCharacters")
class PersonTest {

    /**
     * 검증, 다중검증, 예외 검증 학습하기
     */

    @Test
    void 객체가_정상적으로_생성된다() {
        // given
        String name = "jayLee";
        int age = 26;

        // when
        Person person = new Person(name, age);

        // then
        assertSoftly(softly -> {
            softly.assertThat(person.getName()).isEqualTo(name);
            softly.assertThat(person.getAge()).isEqualTo(age);
        });
    }

    @Test
    void 나이를_먹으면_나이_변수의_값이_오른다() {
        // given
        int age = 25;
        Person person = new Person("jayLee", age);

        // when
        person.addAge();

        // then
        assertThat(person.getAge()).isEqualTo(age + 1);
    }


    /**
     * Todo
     * 아래 테스트들은 mju.example 디렉토리에 Person 객체를 리팩토링 후 테스트 채우기
     */
    @Test
    void 객체_생성시_이름에_들어오는_대문자는_모두_소문자로_변환한다() {
        // given

        // when

        // then
    }

    @Test
    void 나이가_30살이_넘어가면_예외를_발생시킨다() {
        // given

        // when

        // then
//        assertThatThrownBy(() -> person.addAge())
//                .isInstanceOf(예외.class);
    }
}
