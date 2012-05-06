/*
 * This file is part of lanterna (http://code.google.com/p/lanterna/).
 * 
 * lanterna is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright (C) 2010-2011 mabe02
 */

package com.googlecode.lanterna.test;

import com.googlecode.lanterna.LanternException;
import com.googlecode.lanterna.LanternTerminal;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.ScreenWriter;

/**
 *
 * @author martin
 */
public class TerminalColorTest
{
    public static void main(String[] args) throws LanternException
    {
        LanternTerminal lanternTerminal = new LanternTerminal();
        if (lanternTerminal == null)
        {
            System.err.println("Couldn't allocate a terminal!");
            return;
        }
        Screen screen = lanternTerminal.getScreen();
        lanternTerminal.start();

        ScreenWriter writer = new ScreenWriter(screen);
        writer.setForegroundColor(Terminal.Color.DEFAULT);
        writer.setBackgroundColor(Terminal.Color.DEFAULT);
        writer.drawString(10, 1, "Hello World");

        writer.setForegroundColor(Terminal.Color.BLACK);
        writer.setBackgroundColor(Terminal.Color.WHITE);
        writer.drawString(11, 2, "Hello World");
        writer.setForegroundColor(Terminal.Color.WHITE);
        writer.setBackgroundColor(Terminal.Color.BLACK);
        writer.drawString(12, 3, "Hello World");
        writer.setForegroundColor(Terminal.Color.BLACK);
        writer.setBackgroundColor(Terminal.Color.WHITE);
        writer.drawString(13, 4, "Hello World", Terminal.Style.Bold);
        writer.setForegroundColor(Terminal.Color.WHITE);
        writer.setBackgroundColor(Terminal.Color.BLACK);
        writer.drawString(14, 5, "Hello World", Terminal.Style.Bold);
        writer.setForegroundColor(Terminal.Color.DEFAULT);
        writer.setBackgroundColor(Terminal.Color.DEFAULT);
        writer.drawString(15, 6, "Hello World", Terminal.Style.Bold);
        writer.setForegroundColor(Terminal.Color.DEFAULT);
        writer.setBackgroundColor(Terminal.Color.DEFAULT);
        writer.drawString(16, 7, "Hello World");

        writer.setForegroundColor(Terminal.Color.BLUE);
        writer.setBackgroundColor(Terminal.Color.DEFAULT);
        writer.drawString(10, 10, "Hello World");
        writer.setForegroundColor(Terminal.Color.BLUE);
        writer.setBackgroundColor(Terminal.Color.WHITE);
        writer.drawString(11, 11, "Hello World");
        writer.setForegroundColor(Terminal.Color.BLUE);
        writer.setBackgroundColor(Terminal.Color.BLACK);
        writer.drawString(12, 12, "Hello World");
        writer.setForegroundColor(Terminal.Color.BLUE);
        writer.setBackgroundColor(Terminal.Color.MAGENTA);
        writer.drawString(13, 13, "Hello World");
        writer.setForegroundColor(Terminal.Color.GREEN);
        writer.setBackgroundColor(Terminal.Color.DEFAULT);
        writer.drawString(14, 14, "Hello World");
        writer.setForegroundColor(Terminal.Color.GREEN);
        writer.setBackgroundColor(Terminal.Color.WHITE);
        writer.drawString(15, 15, "Hello World");
        writer.setForegroundColor(Terminal.Color.GREEN);
        writer.setBackgroundColor(Terminal.Color.BLACK);
        writer.drawString(16, 16, "Hello World");
        writer.setForegroundColor(Terminal.Color.GREEN);
        writer.setBackgroundColor(Terminal.Color.MAGENTA);
        writer.drawString(17, 17, "Hello World");

        writer.setForegroundColor(Terminal.Color.BLUE);
        writer.setBackgroundColor(Terminal.Color.DEFAULT);
        writer.drawString(10, 20, "Hello World", Terminal.Style.Bold);
        writer.setForegroundColor(Terminal.Color.BLUE);
        writer.setBackgroundColor(Terminal.Color.WHITE);
        writer.drawString(11, 21, "Hello World", Terminal.Style.Bold);
        writer.setForegroundColor(Terminal.Color.BLUE);
        writer.setBackgroundColor(Terminal.Color.BLACK);
        writer.drawString(12, 22, "Hello World", Terminal.Style.Bold);
        writer.setForegroundColor(Terminal.Color.BLUE);
        writer.setBackgroundColor(Terminal.Color.MAGENTA);
        writer.drawString(13, 23, "Hello World", Terminal.Style.Bold);
        writer.setForegroundColor(Terminal.Color.GREEN);
        writer.setBackgroundColor(Terminal.Color.DEFAULT);
        writer.drawString(14, 24, "Hello World", Terminal.Style.Bold);
        writer.setForegroundColor(Terminal.Color.GREEN);
        writer.setBackgroundColor(Terminal.Color.WHITE);
        writer.drawString(15, 25, "Hello World", Terminal.Style.Bold);
        writer.setForegroundColor(Terminal.Color.GREEN);
        writer.setBackgroundColor(Terminal.Color.BLACK);
        writer.drawString(16, 26, "Hello World", Terminal.Style.Bold);
        writer.setForegroundColor(Terminal.Color.CYAN);
        writer.setBackgroundColor(Terminal.Color.BLUE);
        writer.drawString(17, 27, "Hello World", Terminal.Style.Bold);
        screen.refresh();
        
        try
        {
            Thread.sleep(5000);
        } catch (InterruptedException e)
        {
        }
        lanternTerminal.stopAndRestoreTerminal();
    }
}