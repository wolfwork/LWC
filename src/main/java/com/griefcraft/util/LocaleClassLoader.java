/**
 * This file is part of LWC (https://github.com/Hidendra/LWC)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.griefcraft.util;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class LocaleClassLoader extends ClassLoader {

    @Override
    protected URL findResource(String name) {
        File file = new File("plugins/LWC/locale/" + name);

        try {
            return new URL("file:" + file.getAbsolutePath());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return super.findResource(name);
    }

}
