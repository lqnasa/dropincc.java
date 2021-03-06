/*******************************************************************************
 * Copyright (c) 2012 pf_miles.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     pf_miles - initial API and implementation
 ******************************************************************************/
package com.github.pfmiles.dropincc.impl;

import java.util.ArrayList;
import java.util.List;

import com.github.pfmiles.dropincc.Predicate;
import com.github.pfmiles.dropincc.impl.util.Util;

/**
 * Compiled rule alternative, with matching element sequence and look-aheads,
 * action
 * 
 * @author pf-miles
 * 
 */
public class CAlternative {

    private List<EleType> matchSequence = new ArrayList<EleType>();
    private Object action = null;
    private Predicate<?> predicate = null;

    public CAlternative(List<EleType> ms, Object action, Predicate<?> pred) {
        this.matchSequence = ms;
        this.action = action;
        this.predicate = pred;
    }

    public List<EleType> getMatchSequence() {
        return matchSequence;
    }

    public void setMatchSequence(List<EleType> matchSequence) {
        this.matchSequence = matchSequence;
    }

    public Object getAction() {
        return action;
    }

    public void setAction(Object action) {
        this.action = action;
    }

    // same hashCode method as Object.class needed
    public int hashCode() {
        return super.hashCode();
    }

    // same equals method as Object.class needed
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CAlternative(").append(this.matchSequence.toString());
        if (this.action != null)
            sb.append(", ").append(Util.resolveActionName(this.action));
        sb.append(")");
        return sb.toString();
    }

    public Predicate<?> getPredicate() {
        return predicate;
    }

    public void setPredicate(Predicate<?> predicate) {
        this.predicate = predicate;
    }
}
