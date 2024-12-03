package io.lacrobate.adventofcode.day1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PuzzleTest {

	@Test
	@DisplayName("should return to 0 when I resolve empty file")
	public void whenITryToResolveForEmptyFile() throws IOException {
		Puzzle puzzle = new Puzzle("testInput_empty.txt");
		//    when
		int result = puzzle.resolve();

		//    then
		assertThat(result).isEqualTo(0);
	}


	@Test
	@DisplayName("should throw exception when I resolve for lists of different size")
	public void whenITryResolveForListsOfDifferentSize() {
		Puzzle puzzle = new Puzzle("testInput_differentSizes.txt");
		//    when
		assertThrows(IllegalStateException.class,
				() -> puzzle.resolve());
	}

	@Test
	@DisplayName("should resolve to 0 when I resolve for file having identical lists")
	public void whenIResolveForIdenticalLists() throws IOException {
		Puzzle puzzle = new Puzzle("testInput_identical.txt");
		//    when
		int result = puzzle.resolve();

		//    then
		assertThat(result).isEqualTo(0);
	}

	@Test
	@DisplayName("should return answer when I resolve for lists of few elements")
	public void whenIResolveForListsOfAFew() throws IOException {
		Puzzle puzzle = new Puzzle("testInput.txt");
		//    when
		int result = puzzle.resolve();

		//    then
		assertThat(result).isEqualTo(2);
	}

	@Test
	@DisplayName("final solution?")
	public void whenIResolveForListFromFile() throws IOException {

		Puzzle puzzle = new Puzzle("input.txt");
		//    then
		assertThat(puzzle.resolve())
				.isEqualTo(1530215);
	}
}