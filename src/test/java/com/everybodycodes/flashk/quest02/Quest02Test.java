package com.everybodycodes.flashk.quest02;

import com.everybodycodes.flashk.common.test.constants.TestDisplayName;
import com.everybodycodes.flashk.common.test.constants.TestFilename;
import com.everybodycodes.flashk.common.test.constants.TestFolder;
import com.everybodycodes.flashk.common.test.constants.TestTag;
import com.everybodycodes.flashk.common.test.utils.Input;
import com.everybodycodes.flashk.common.test.utils.PuzzleTest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName(TestDisplayName.QUEST_02)
@TestMethodOrder(OrderAnnotation.class)
@Disabled // TODO Remove comment when implemented
public class Quest02Test extends PuzzleTest {

	private static final String INPUT_FOLDER = TestFolder.QUEST_02;

	@Test
	@Order(1)
	@Tag(TestTag.PART_1)
	@Tag(TestTag.SAMPLE)
	@DisplayName(TestDisplayName.PART_1_SAMPLE)
	public void testSolvePart1Sample() {

		// Read input file
		List<String> inputs = Input.readStringLines(INPUT_FOLDER, TestFilename.INPUT_FILE_SAMPLE_PART_1);

		RunesOfPower runesOfPower = new RunesOfPower(inputs);

		assertEquals(4L, runesOfPower.solveA());
	}

	@Test
	@Order(2)
	@Tag(TestTag.PART_1)
	@Tag(TestTag.INPUT)
	@DisplayName(TestDisplayName.PART_1_INPUT)
	public void testSolvePart1Input() {

		// Read input file
		List<String> inputs = Input.readStringLines(INPUT_FOLDER, TestFilename.INPUT_FILE_PART_1);
		RunesOfPower runesOfPower = new RunesOfPower(inputs);

		assertEquals(34L, runesOfPower.solveA());

	}

	@Test
	@Order(3)
	@Tag(TestTag.PART_2)
	@Tag(TestTag.SAMPLE)
	@DisplayName(TestDisplayName.PART_2_SAMPLE)
	public void testSolvePart2Sample() {

		// Read input file
		List<String> inputs = Input.readStringLines(INPUT_FOLDER, TestFilename.INPUT_FILE_SAMPLE_PART_2);
		RunesOfPower runesOfPower = new RunesOfPower(inputs);

		//System.out.println("Solution: "+runesOfPower.solveB());
		assertEquals(42L, runesOfPower.solveB());
	}

	@Test
	@Order(4)
	@Tag(TestTag.PART_2)
	@Tag(TestTag.INPUT)
	@DisplayName(TestDisplayName.PART_2_INPUT)
	public void testSolvePart2Input() {

		// Read input file
		List<String> inputs = Input.readStringLines(INPUT_FOLDER, TestFilename.INPUT_FILE_PART_2);
		RunesOfPower runesOfPower = new RunesOfPower(inputs);

		assertEquals(5470L, runesOfPower.solveB());

	}

	@Test
	@Order(5)
	@Tag(TestTag.PART_3)
	@Tag(TestTag.SAMPLE)
	@DisplayName(TestDisplayName.PART_3_SAMPLE)
	public void testSolvePart3Sample() {

		// Read input file
		List<String> inputs = Input.readStringLines(INPUT_FOLDER, TestFilename.INPUT_FILE_SAMPLE_PART_3);

		RunesOfPowerScaleArmour runesOfPower = new RunesOfPowerScaleArmour(inputs);

		//System.out.println("Solution: "+runesOfPower.solveC());
		assertEquals(10L, runesOfPower.solve());

	}

	@Test
	@Order(6)
	@Tag(TestTag.PART_3)
	@Tag(TestTag.INPUT)
	@DisplayName(TestDisplayName.PART_3_INPUT)
	public void testSolvePart3Input() {

		// Read input file
		List<String> inputs = Input.readStringLines(INPUT_FOLDER, TestFilename.INPUT_FILE_PART_3);
		RunesOfPowerScaleArmour runesOfPower = new RunesOfPowerScaleArmour(inputs);

		System.out.println("Solution: "+runesOfPower.solve());
		//assertEquals(42L, runesOfPower.solveC());

        // Attempts

        // Solution: 10833
        // Your answer length is: correct
        // The first character of your answer is: correct
	}

}
