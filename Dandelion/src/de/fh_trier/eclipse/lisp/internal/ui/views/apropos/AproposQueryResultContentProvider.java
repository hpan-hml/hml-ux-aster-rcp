/*
 Dandelion, a Lisp plugin for Eclipse.
 Copyright (C) 2007 Michael Bohn

 This program is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation; either version 2 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License along
 with this program; if not, write to the Free Software Foundation, Inc.,
 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package de.fh_trier.eclipse.lisp.internal.ui.views.apropos;

import java.util.SortedSet;

import org.eclipse.jface.viewers.*;

import de.fh_trier.eclipse.lisp.internal.core.meta.IMetaSymbol;

class AproposQueryResultContentProvider 
implements IStructuredContentProvider
{
	private static final Object[] EMPTY_ELEMENTS = new Object[0];
	
	private SortedSet<IMetaSymbol> fCurrentInput;
	
	@SuppressWarnings("unchecked")
	public void inputChanged(Viewer v, Object oldInput, Object newInput) 
	{
		if(newInput instanceof SortedSet) {
			fCurrentInput = (SortedSet<IMetaSymbol>)newInput;
		}
	}
	
	public void dispose() {
		//no-op
	}
	
	public Object[] getElements(final Object parent) {
		if(fCurrentInput == null) {
			return EMPTY_ELEMENTS;
		}
		return fCurrentInput.toArray();
	}
}