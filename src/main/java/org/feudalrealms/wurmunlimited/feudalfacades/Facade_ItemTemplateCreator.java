package org.feudalrealms.wurmunlimited.feudalfacades;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.ItemTemplateCreator;
import com.wurmonline.server.items.ItemTypes;


import java.io.IOException;

/**
 * Created by Ausimus on 1/12/2017.
 */
public class Facade_ItemTemplateCreator {
    Facade_ItemTemplateCreator() {
        try {
            //Log Facades




            ItemTemplateCreator.createItemTemplate(Constants.LFWTemplateID, "Log Facade Wall", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "A Log Wall.",
                    new short[]{
                            ItemTypes.ITEM_TYPE_DECORATION,
                            ItemTypes.ITEM_TYPE_TRANSPORTABLE,
                            ItemTypes.ITEM_TYPE_NAMED,
                            ItemTypes.ITEM_TYPE_OWNER_TURNABLE,
                            ItemTypes.ITEM_TYPE_REPAIRABLE,
                            ItemTypes.ITEM_TYPE_OWNER_MOVEABLE,
                            ItemTypes.ITEM_TYPE_USE_GROUND_ONLY,
                            ItemTypes.ITEM_TYPE_WOOD
                    }, (short) 60, (short) 1, 0, 9223372036854775807L, 400, 100, 300, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.LogFacadeWall.", 1.0F, 50000, (byte) 14);

            ItemTemplateCreator.createItemTemplate(Constants.LFDNTemplateID, "Log Facade Doorway Narrow", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "A Log Wall.",
                    new short[]{
                            ItemTypes.ITEM_TYPE_DECORATION,
                            ItemTypes.ITEM_TYPE_TRANSPORTABLE,
                            ItemTypes.ITEM_TYPE_NAMED,
                            ItemTypes.ITEM_TYPE_OWNER_TURNABLE,
                            ItemTypes.ITEM_TYPE_REPAIRABLE,
                            ItemTypes.ITEM_TYPE_OWNER_MOVEABLE,
                            ItemTypes.ITEM_TYPE_USE_GROUND_ONLY,
                            ItemTypes.ITEM_TYPE_WOOD
                    }, (short) 60, (short) 1, 0, 9223372036854775807L, 400, 100, 300, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.LogMockFacadeDoorNarrow.", 1.0F, 50000, (byte) 14);

            ItemTemplateCreator.createItemTemplate(Constants.LFRSTemplateID, "Log Facade Right Strut", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "A Log Wall.",
                    new short[]{
                            ItemTypes.ITEM_TYPE_DECORATION,
                            ItemTypes.ITEM_TYPE_TRANSPORTABLE,
                            ItemTypes.ITEM_TYPE_NAMED,
                            ItemTypes.ITEM_TYPE_OWNER_TURNABLE,
                            ItemTypes.ITEM_TYPE_REPAIRABLE,
                            ItemTypes.ITEM_TYPE_OWNER_MOVEABLE,
                            ItemTypes.ITEM_TYPE_USE_GROUND_ONLY,
                            ItemTypes.ITEM_TYPE_WOOD
                    }, (short) 60, (short) 1, 0, 9223372036854775807L, 400, 100, 300, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.LogMockFacadeRightStrut.", 1.0F, 24000, (byte) 14);

            ItemTemplateCreator.createItemTemplate(Constants.LFLSTemplateID, "Log Facade Left Strut", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "A Log Wall.",
                    new short[]{
                            ItemTypes.ITEM_TYPE_DECORATION,
                            ItemTypes.ITEM_TYPE_TRANSPORTABLE,
                            ItemTypes.ITEM_TYPE_NAMED,
                            ItemTypes.ITEM_TYPE_OWNER_TURNABLE,
                            ItemTypes.ITEM_TYPE_REPAIRABLE,
                            ItemTypes.ITEM_TYPE_OWNER_MOVEABLE,
                            ItemTypes.ITEM_TYPE_USE_GROUND_ONLY,
                            ItemTypes.ITEM_TYPE_WOOD
                    }, (short) 60, (short) 1, 0, 9223372036854775807L, 400, 100, 300, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.LogMockFacadeLeftStrut.", 1.0F, 24000, (byte) 14);

            ItemTemplateCreator.createItemTemplate(Constants.LFDWTemplateID, "Log Facade Double Door", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "A Log Wall.",
                    new short[]{
                            ItemTypes.ITEM_TYPE_DECORATION,
                            ItemTypes.ITEM_TYPE_TRANSPORTABLE,
                            ItemTypes.ITEM_TYPE_NAMED,
                            ItemTypes.ITEM_TYPE_OWNER_TURNABLE,
                            ItemTypes.ITEM_TYPE_REPAIRABLE,
                            ItemTypes.ITEM_TYPE_OWNER_MOVEABLE,
                            ItemTypes.ITEM_TYPE_USE_GROUND_ONLY,
                            ItemTypes.ITEM_TYPE_WOOD
                    }, (short) 60, (short) 1, 0, 9223372036854775807L, 400, 100, 300, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.LogMockFacadeDoorDouble.", 1.0F, 50000, (byte) 14);
            ItemTemplateCreator.createItemTemplate(Constants.LFWindowTemplateID, "Log Facade Window", "statues", "almost full", "somewhat occupied", "half-full", "emptyish", "A Log Wall.",
                    new short[]{
                            ItemTypes.ITEM_TYPE_DECORATION,
                            ItemTypes.ITEM_TYPE_TRANSPORTABLE,
                            ItemTypes.ITEM_TYPE_NAMED,
                            ItemTypes.ITEM_TYPE_OWNER_TURNABLE,
                            ItemTypes.ITEM_TYPE_REPAIRABLE,
                            ItemTypes.ITEM_TYPE_OWNER_MOVEABLE,
                            ItemTypes.ITEM_TYPE_USE_GROUND_ONLY,
                            ItemTypes.ITEM_TYPE_WOOD
                    }, (short) 60, (short) 1, 0, 9223372036854775807L, 400, 100, 300, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.LogMockFacadeWindow.", 1.0F, 50000, (byte) 14);

            ItemTemplateCreator.createItemTemplate(Constants.FRTapestryRealmsTemplateID, "tapestry of Feudal Realms", "tapestries", "excellent", "good", "ok", "poor", "A nice woven Tapestry of Feudal Realms made by KalXen.",
                    new short[]{
                            ItemTypes.ITEM_TYPE_CLOTH,
                            ItemTypes.ITEM_TYPE_DECORATION,
                            ItemTypes.ITEM_TYPE_ONE_PER_TILE,
                            ItemTypes.ITEM_TYPE_DESTROYABLE,
                            ItemTypes.ITEM_TYPE_IMPROVEITEM,
                            ItemTypes.ITEM_TYPE_REPAIRABLE,
                            ItemTypes.ITEM_TYPE_TAPESTRY,
                            ItemTypes.ITEM_TYPE_NOT_MISSION,
                            ItemTypes.ITEM_TYPE_IMPROVE_USES_TYPE_AS_MATERIAL,
                            ItemTypes.ITEM_TYPE_TURNABLE
                    }, (short)60, (short)1, 0, 9223372036854775807L, 5, 5, 205, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.furniture.tapestry_fr.realms.", 30.0F, 12000, (byte)69, 10000, true);


        } catch (IOException ignored) {
        }
    }
}
