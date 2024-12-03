package io.lacrobate.adventofcode.common;

import io.lacrobate.adventofcode.day1.LocationList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class InputReaderTest {

	@Test
	@DisplayName("should XXX when I read testFile")
	public void whenIReadTestFile() throws IOException {

		//    when
		LocationList result = InputReader.read("testInput.txt");
		//    then
		assertThat(result.getLeftIds()).containsExactly(80784, 81682, 22289);
		assertThat(result.getRightIds()).containsExactly(47731, 36089, 41038);
	}

}