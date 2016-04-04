package com.hackerrank.practice.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import static com.hackerrank.practice.TextDollar.*;

public class TextDollarTest {
  @Test
  public void f() {
	  Assert.assertEquals(dollarToText(3), "ThreeDollars");
		Assert.assertEquals(dollarToText(10), "TenDollars");
		Assert.assertEquals(dollarToText(21), "TwentyOneDollars");
		Assert.assertEquals(dollarToText(466), "FourHundredSixtySixDollars");
		Assert.assertEquals(dollarToText(1234), "OneThousandTwoHundredThirtyFourDollars");
		
		Assert.assertEquals(dollarToText(901), "NineHundredOneDollars");
		Assert.assertEquals(dollarToText(682), "SixHundredEightyTwoDollars");
		Assert.assertEquals(dollarToText(686), "SixHundredEightySixDollars");
		Assert.assertEquals(dollarToText(86503553), "EightySixMillionFiveHundredThreeThousandFiveHundredFiftyThreeDollars");
		Assert.assertEquals(dollarToText(123456789), "OneHundredTwentyThreeMillionFourHundredFiftySixThousandSevenHundredEightyNineDollars");
		Assert.assertEquals(dollarToText(7193), "SevenThousandOneHundredNinetyThreeDollars");
		Assert.assertEquals(dollarToText(100000000), "OneHundredMillionDollars");
		Assert.assertEquals(dollarToText(771822234), "SevenHundredSeventyOneMillionEightHundredTwentyTwoThousandTwoHundredThirtyFourDollars");
		Assert.assertEquals(dollarToText(710824780), "SevenHundredTenMillionEightHundredTwentyFourThousandSevenHundredEightyDollars");
		Assert.assertEquals(dollarToText(106), "OneHundredSixDollars");
		Assert.assertEquals(dollarToText(621), "SixHundredTwentyOneDollars");
		Assert.assertEquals(dollarToText(53704), "FiftyThreeThousandSevenHundredFourDollars");
		Assert.assertEquals(dollarToText(639), "SixHundredThirtyNineDollars");
		Assert.assertEquals(dollarToText(1), "OneDollars");
		Assert.assertEquals(dollarToText(65420210), "SixtyFiveMillionFourHundredTwentyThousandTwoHundredTenDollars");
		Assert.assertEquals(dollarToText(21), "TwentyOneDollars");
		Assert.assertEquals(dollarToText(83874), "EightyThreeThousandEightHundredSeventyFourDollars");
		Assert.assertEquals(dollarToText(43), "FortyThreeDollars");
		Assert.assertEquals(dollarToText(263860671), "TwoHundredSixtyThreeMillionEightHundredSixtyThousandSixHundredSeventyOneDollars");
		Assert.assertEquals(dollarToText(506), "FiveHundredSixDollars");
		Assert.assertEquals(dollarToText(80004), "EightyThousandFourDollars");
		Assert.assertEquals(dollarToText(633), "SixHundredThirtyThreeDollars");
		Assert.assertEquals(dollarToText(78655), "SeventyEightThousandSixHundredFiftyFiveDollars");
		Assert.assertEquals(dollarToText(827507765), "EightHundredTwentySevenMillionFiveHundredSevenThousandSevenHundredSixtyFiveDollars");
		Assert.assertEquals(dollarToText(571), "FiveHundredSeventyOneDollars");
		Assert.assertEquals(dollarToText(809), "EightHundredNineDollars");
		Assert.assertEquals(dollarToText(662), "SixHundredSixtyTwoDollars");
		Assert.assertEquals(dollarToText(313337151), "ThreeHundredThirteenMillionThreeHundredThirtySevenThousandOneHundredFiftyOneDollars");
		Assert.assertEquals(dollarToText(712), "SevenHundredTwelveDollars");
		Assert.assertEquals(dollarToText(13182), "ThirteenThousandOneHundredEightyTwoDollars");
		Assert.assertEquals(dollarToText(3008), "ThreeThousandEightDollars");
		Assert.assertEquals(dollarToText(46494), "FortySixThousandFourHundredNinetyFourDollars");
		Assert.assertEquals(dollarToText(5647), "FiveThousandSixHundredFortySevenDollars");
		Assert.assertEquals(dollarToText(80670), "EightyThousandSixHundredSeventyDollars");
		Assert.assertEquals(dollarToText(414), "FourHundredFourteenDollars");
		Assert.assertEquals(dollarToText(29909), "TwentyNineThousandNineHundredNineDollars");
		Assert.assertEquals(dollarToText(547), "FiveHundredFortySevenDollars");
		Assert.assertEquals(dollarToText(501), "FiveHundredOneDollars");
		Assert.assertEquals(dollarToText(604488664), "SixHundredFourMillionFourHundredEightyEightThousandSixHundredSixtyFourDollars");
		Assert.assertEquals(dollarToText(24356), "TwentyFourThousandThreeHundredFiftySixDollars");
  }
}
