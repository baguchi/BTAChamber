package baguchan.chamber_bta.util;

import baguchan.chamber_bta.ChamberBTA;

public class IDUtils {
	private static int curr_item_id = ChamberBTA.config.getInt("starting_item_id");
	private static int curr_block_id = ChamberBTA.config.getInt("starting_block_id");

	public static int getCurrBlockId() {
		return curr_block_id++;
	}

	public static int getCurrItemId() {
		return curr_item_id++;
	}
}
