package sdljava;
/**
 *  sdljava - a java binding to the SDL API
 *
 *  Copyright (C) 2004  Ivan Z. Ganza
 * 
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 * 
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 * 
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 *  USA
 *
 *  Ivan Z. Ganza (ivan_ganza@yahoo.com)
 */

/**
 * Binding to the SDL Timer routines.
 *
 * @author  Bart Leboeuf (bartleboeuf@yahoo.fr)
 * @version $Id: SDLTimer.java,v 1.1 2005/01/30 21:33:06 doc_alton Exp $
 */
public class SDLTimer {

	/**
	 * Wait a specified number of milliseconds before returning.
	 * 
	 * @param ms Wait a specified number of milliseconds before returning.
	 */
	public static void delay(long ms) throws InterruptedException {
		Thread.sleep(ms);
	}

	/**
	 * Get the number of milliseconds since the SDL library initialization.
	 * 
	 * @return long Get the number of milliseconds since the SDL library initialization. 
	 */
	public static long getTicks() {
		return (System.currentTimeMillis()-SDLMain.getStartedTime());
	}
	
} // class SDLTimer