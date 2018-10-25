package org.feudalrealms.wurmunlimited.feudalfacades;

import com.wurmonline.server.items.*;
import com.wurmonline.server.skills.Skill;
import com.wurmonline.server.skills.SkillList;

/**
 * Created by Ausimus on 1/12/2017.
 */
public class Facade_CreationEntry {
    Facade_CreationEntry() {
        if (Constants.CanCraftFacades) {
            //Log Wall
            AdvancedCreationEntry FacadeWallLog = CreationEntryCreator.createAdvancedEntry
                    (SkillList.CARPENTRY, ItemList.log, ItemList.log, Constants.LFWTemplateID, false, false, 0.0F, true, true, CreationCategories.DECORATION);
            FacadeWallLog.addRequirement(new CreationRequirement(1, ItemList.log, 8, true));
            FacadeWallLog.addRequirement(new CreationRequirement(2, ItemList.pegWood, 16, true));
            //Log Door Narrow
            AdvancedCreationEntry FacadeDoorNarrowLog = CreationEntryCreator.createAdvancedEntry
                    (SkillList.CARPENTRY, ItemList.log, ItemList.log, Constants.LFDNTemplateID, false, false, 0.0F, true, true, CreationCategories.DECORATION);
            FacadeDoorNarrowLog.addRequirement(new CreationRequirement(1, ItemList.log, 8, true));
            FacadeDoorNarrowLog.addRequirement(new CreationRequirement(2, ItemList.pegWood, 16, true));
            FacadeDoorNarrowLog.addRequirement(new CreationRequirement(3, ItemList.plank, 3, true));
            //Right Strut
            CreationEntryCreator.createSimpleEntry(SkillList.CARPENTRY, ItemList.log, ItemList.log, Constants.LFRSTemplateID, false, true, 0.0f, true, true, CreationCategories.DECORATION);
            //Left Strut
            CreationEntryCreator.createSimpleEntry(SkillList.CARPENTRY, ItemList.log, ItemList.log, Constants.LFLSTemplateID, false, true, 0.0f, true, true, CreationCategories.DECORATION);
            //Log Door Wide
            AdvancedCreationEntry FacadeDoorWideLog = CreationEntryCreator.createAdvancedEntry
                    (SkillList.CARPENTRY, ItemList.log, ItemList.log, Constants.LFDWTemplateID, false, false, 0.0F, true, true, CreationCategories.DECORATION);
            FacadeDoorWideLog.addRequirement(new CreationRequirement(1, ItemList.log, 8, true));
            FacadeDoorWideLog.addRequirement(new CreationRequirement(2, ItemList.pegWood, 16, true));
            FacadeDoorWideLog.addRequirement(new CreationRequirement(3, ItemList.plank, 3, true));
            //Log Window
            AdvancedCreationEntry FacadeLogWindow = CreationEntryCreator.createAdvancedEntry
                    (SkillList.CARPENTRY, ItemList.log, ItemList.log, Constants.LFWindowTemplateID, false, false, 0.0F, true, true, CreationCategories.DECORATION);
            FacadeLogWindow.addRequirement(new CreationRequirement(1, ItemList.log, 8, true));
            FacadeLogWindow.addRequirement(new CreationRequirement(2, ItemList.pegWood, 16, true));
            FacadeLogWindow.addRequirement(new CreationRequirement(3, ItemList.plank, 4, true));

            // Tapestries
            AdvancedCreationEntry FacadeTapRealms = CreationEntryCreator.createAdvancedEntry
                    (SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, Constants.FRTapestryRealmsTemplateID, false, false, 0.0F, true, true, CreationCategories.DECORATION);
            FacadeTapRealms.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
            FacadeTapRealms.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 6, true));

            AdvancedCreationEntry FacadeTapPony = CreationEntryCreator.createAdvancedEntry
                    (SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, Constants.FRTapestryPonyTemplateID, false, false, 0.0F, true, true, CreationCategories.DECORATION);
            FacadeTapPony.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
            FacadeTapPony.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 6, true));

            AdvancedCreationEntry FacadeTapBlacksmith = CreationEntryCreator.createAdvancedEntry
                    (SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, Constants.FRTapestryBlacksmithTemplateID, false, false, 0.0F, true, true, CreationCategories.DECORATION);
            FacadeTapBlacksmith.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
            FacadeTapBlacksmith.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 6, true));

            AdvancedCreationEntry FacadeTapBattle = CreationEntryCreator.createAdvancedEntry
                    (SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, Constants.FRTapestryBattleTemplateID, false, false, 0.0F, true, true, CreationCategories.DECORATION);
            FacadeTapBattle.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
            FacadeTapBattle.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 6, true));

            AdvancedCreationEntry FacadeTapKnights = CreationEntryCreator.createAdvancedEntry
                    (SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, Constants.FRTapestryKnightsTemplateID, false, false, 0.0F, true, true, CreationCategories.DECORATION);
            FacadeTapKnights.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
            FacadeTapKnights.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 6, true));

        }
    }
}
