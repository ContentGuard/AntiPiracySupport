/*
 * Copyright (C) 2015 The Content Guard Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.antipiracy.support.utils;

/** 
 * This service blocks the install of known piracy/malware apps. Please report new piracy
 * apps to ROM developers deploying this code.
 * @author github.com/AlmightyMegadeth00 - activethrasher00@gmail.com
 * Note: the current source can be found in github.com/ContentGuard
 */
public class AntiPiracyConstants {
	public static final boolean DEBUG = false;

	/**
     * Blacklist by application:
     * This list is likely to give false-positives if not used properly... this will be optional within user
     * settings.
     */
    public static final String[] PACKAGES = {
    
        //Anti Piracy inclusions:
        // Package names                                       // App names
        "com.dimonvideo.luckypatcher",                         // Lucky patcher
        "com.chelpus.lackypatch",                              // Another lucky patcher
        "com.forpda.lp",                                       // And another one
        "com.blackmartalpha",                                  // Black Mart alpha
        "org.blackmart.market",                                // Black Mart
        "com.android.vending.billing.InAppBillingService.LUCK",// Lucky patcher 5.6.8
        "com.android.vending.billing.InAppBillingService.LACK",// Lucky patcher 5.9.x and 6.0.x
        "cc.madkite.freedom",                                  // Freedom
        "com.allinone.free",                                   // All-in-one Downloader
        "com.repodroid.app",                                   // Get Apk Market
        "org.creeplays.hack",                                  // CreeHack
        "com.baseappfull.fwd",                                 // Game Hacker
        "com.zmapp",                                           // Z market
        "com.dv.marketmod.installer",                          // Hacked play store that gives refunds without uninstalling the apk
        "org.mobilism.android",                                // Mobilism market
        "com.xperia64.rompatcher",                             // ROM patcher
        "com.xperia64.rompatcher.donate",                      // ROM patcher donate
        "com.android.protips",                                 // Lucky patcher with fake package name
        "p.jasi2169.al3",                                      //Action Launcher3 Patcher
        "z.jasi2169.tbpatch",                                  // Titanium Bacup patcher

        //Anti Malware inclustions:
        "com.android.wp.net.log",                                // Ghost Push Trojan: Timeservice
        "com.android.camera.update"                              // Ghost Push Trojan infected

    };

    /**
     * Blacklist by application:
     * This list is likely to give false-positives if not used properly... this will be optional within user
     * settings.
     * TODO: evaluate with case insensitivity
     */
    public static final String[] APPLICATION_NAMES = {
        "Luck Patcher",
        "Black Mart",
        "Black Mart alpha"
    };
}
