
package com.ss.utility;

import java.util.Random;

public class Swag {
	public static void beginSwag() {
		String[] swag = new String[] { "SWAG", "SWAGGITY", "SWAAAAGGG", "SUPER SWAG", "SWAGGITY SWAGGY", "SWAGGY", "SWAGGIDOODLES", "UBER-SWAG", "SUCH SWAG", "MANY SWAG", "DARUDE SWAGSTORM", "SWAGGERS", "SUPER-UBER-SWAGGITY SWAGGY SWAGGIDOODLES", "SWEG", "SWAGGG" };
		for (int i = 1; i < 1337; i++) {
			System.out.println(swag[new Random().nextInt(swag.length)]);
		}
	}
}
