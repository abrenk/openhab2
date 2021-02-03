/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.enocean.internal.eep.D2_50;

import org.openhab.binding.enocean.internal.messages.ERP1Message;

/**
 * Heat Recovery Ventilation: single room ventilation unit
 *
 * @author Andreas Brenk - Initial contribution
 */
public class D2_50_00 extends D2_50 {

    public D2_50_00() {
        super();
    }

    public D2_50_00(ERP1Message packet) {
        super(packet);
    }
}
