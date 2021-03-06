/*=============================================================================#
 # Copyright (c) 2009-2014 Stephan Wahlbrink (WalWare.de) and others.
 # All rights reserved. This program and the accompanying materials
 # are made available under the terms of the Eclipse Public License v1.0
 # which accompanies this distribution, and is available at
 # http://www.eclipse.org/legal/epl-v10.html
 # 
 # Contributors:
 #     Stephan Wahlbrink - initial API and implementation
 #=============================================================================*/

package de.walware.rj.eclient.internal.graphics;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;

import de.walware.rj.eclient.graphics.RGraphics;


public class PreferenceInitializer extends AbstractPreferenceInitializer {
	
	
	public PreferenceInitializer() {
	}
	
	
	@Override
	public void initializeDefaultPreferences() {
		final DefaultScope defaultScope = new DefaultScope();
		final IEclipsePreferences node = defaultScope.getNode(RGraphics.PREF_FONTS_QUALIFIER);
		if (Platform.getOS().startsWith("win")) {
			node.put(RGraphics.PREF_FONTS_SERIF_FONTNAME_KEY, "Times New Roman"); //$NON-NLS-1$
			node.put(RGraphics.PREF_FONTS_SANS_FONTNAME_KEY, "Arial"); //$NON-NLS-1$
			node.put(RGraphics.PREF_FONTS_MONO_FONTNAME_KEY, "Courier New"); //$NON-NLS-1$
		}
		else {
			node.put(RGraphics.PREF_FONTS_SERIF_FONTNAME_KEY, "Serif"); //$NON-NLS-1$
			node.put(RGraphics.PREF_FONTS_SANS_FONTNAME_KEY, "Sans"); //$NON-NLS-1$
			node.put(RGraphics.PREF_FONTS_MONO_FONTNAME_KEY, "Mono"); //$NON-NLS-1$
		}
		node.putBoolean(RGraphics.PREF_FONTS_SYMBOL_USE_KEY, true);
		node.put(RGraphics.PREF_FONTS_SYMBOL_FONTNAME_KEY, "Symbol"); //$NON-NLS-1$
		node.put(RGraphics.PREF_FONTS_SYMBOL_ENCODING_KEY, "AdobeSymbol"); //$NON-NLS-1$
	}
	
}
