package com.everybodycodes.flashk.day07;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.everybodycodes.flashk.common.test.constants.TestDisplayName;
import com.everybodycodes.flashk.common.test.constants.TestFilename;
import com.everybodycodes.flashk.common.test.constants.TestFolder;
import com.everybodycodes.flashk.common.test.constants.TestTag;
import com.everybodycodes.flashk.common.test.utils.PuzzleTest;
import com.everybodycodes.flashk.common.test.utils.Timer;
import com.everybodycodes.flashk.common.test.utils.Input;

@DisplayName(TestDisplayName.DAY_07)
@TestMethodOrder(OrderAnnotation.class)
@Disabled // TODO Remove comment when implemented
public class Day07Test extends PuzzleTest {

	private final static String INPUT_FOLDER = TestFolder.DAY_07;

	@BeforeAll
	public static void beforeAll() {
		Timer.printHeader(TestDisplayName.DAY_07);
	}

	
	@Test
	@Order(1)
	@Tag(TestTag.PART_ONE)
	@Tag(TestTag.SAMPLE)
	@DisplayName(TestDisplayName.PART_ONE_SAMPLE)
	public void testSolvePart1Sample() {
		
		System.out.print("1 | sample | ");
		
		// Read input file
		List<String> inputs = Input.readStringLines(INPUT_FOLDER, TestFilename.INPUT_FILE_SAMPLE_PART_1);
		
	}
	
	@Test
	@Order(2)
	@Tag(TestTag.PART_ONE)
	@Tag(TestTag.INPUT)
	@DisplayName(TestDisplayName.PART_ONE_INPUT)
	public void testSolvePart1Input() {
		
		System.out.print("1 | input  | ");
		
		// Read input file
		List<String> inputs = Input.readStringLines(INPUT_FOLDER, TestFilename.INPUT_FILE_PART_1);
		
	}
	
	@Test
	@Order(3)
	@Tag(TestTag.PART_TWO)
	@Tag(TestTag.SAMPLE)
	@DisplayName(TestDisplayName.PART_TWO_SAMPLE)
	public void testSolvePart2Sample() {
		
		System.out.print("2 | sample | ");
		
		// Read input file
		List<String> inputs = Input.readStringLines(INPUT_FOLDER, TestFilename.INPUT_FILE_SAMPLE_PART_1);
		
	}
	
	@Test
	@Order(4)
	@Tag(TestTag.PART_TWO)
	@Tag(TestTag.INPUT)
	@DisplayName(TestDisplayName.PART_TWO_INPUT)
	public void testSolvePart2Input() {
		
		System.out.print("2 | input  | ");
		
		// Read input file
		List<String> inputs = Input.readStringLines(INPUT_FOLDER, TestFilename.INPUT_FILE_PART_1);
		
	}

	@Test
	@Order(5)
	@Tag(TestTag.PART_THREE)
	@Tag(TestTag.SAMPLE)
	@DisplayName(TestDisplayName.PART_THREE_SAMPLE)
	public void testSolvePart3Sample() {
		System.out.print("3 | sample | ");

		// Read input file
		List<String> inputs = Input.readStringLines(INPUT_FOLDER, TestFilename.INPUT_FILE_SAMPLE_PART_1);
	}

	@Test
	@Order(6)
	@Tag(TestTag.PART_THREE)
	@Tag(TestTag.INPUT)
	@DisplayName(TestDisplayName.PART_THREE_INPUT)
	public void testSolvePart3Input() {

		System.out.print("3 | input  | ");

		// Read input file
		List<String> inputs = Input.readStringLines(INPUT_FOLDER, TestFilename.INPUT_FILE_PART_1);
	}

}
