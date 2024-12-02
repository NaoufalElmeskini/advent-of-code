package io.lacrobate.adventofcode.day1;

import io.lacrobate.adventofcode.common.InputReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.util.List.of;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PuzzleTest {

	@Test
	@DisplayName("should XXX when I YYY")
	public void whenITryToResolveForEmptyLists() {
		List<Integer> leftIds = of();
		List<Integer> rightIds = of();
		Puzzle puzzle = new Puzzle(leftIds, rightIds);
		//    when
		int result = puzzle.resolve();

		//    then
		assertThat(result).isEqualTo(0);
	}


	@Test
	@DisplayName("should XXX when I resolve for identical lists")
	public void whenIResolveForIdenticalLists() {
		List<Integer> leftIds = of(1, 2);
		Puzzle puzzle = new Puzzle(leftIds, leftIds);
		//    when
		int result = puzzle.resolve();

		//    then
		assertThat(result).isEqualTo(0);
	}

	@Test
	@DisplayName("should XXX when I resolve for lists of 1 elements")
	public void whenIResolveForListsOf1() {
		List<Integer> leftIds = of(2);
		List<Integer> rightIds = of(5);
		Puzzle puzzle = new Puzzle(leftIds, rightIds);
		//    when
		int result = puzzle.resolve();

		//    then
		assertThat(result).isEqualTo(3);
	}

	@Test
	@DisplayName("should XXX when I resolve for lists of 6 elements")
	public void whenIResolveForListsOf6() {
		//		 * 3   4
//				* 4   3
//				* 2   5
//				* 1   3
//				* 3   9
//				* 3   3


		List<Integer> leftIds = new ArrayList<>(of(3,4,2,1,3,3));
		List<Integer> rightIds = new ArrayList<>(of(4,3,5,3,9,3));
		Puzzle puzzle = new Puzzle(leftIds, rightIds);
		//    when
		int result = puzzle.resolve();

		//    then
		assertThat(result).isEqualTo(11);
	}

	@Test
	@DisplayName("should XXX when I resolve for lists of different size")
	public void whenITryResolveForListsOfDifferentSize() {
		List<Integer> leftIds = List.of(2);
		List<Integer> rightIds = List.of(5,5);
		Puzzle puzzle = new Puzzle(leftIds, rightIds);
		//    when
		assertThrows(IllegalStateException.class,
				() -> puzzle.resolve());
	}

	@Test
	@DisplayName("should XXX when I YYY")
	public void whenITryToXXX() throws IOException {
		//    when
		InputReader.read();
		//    then
		assertThat(false).isTrue();
	}

}