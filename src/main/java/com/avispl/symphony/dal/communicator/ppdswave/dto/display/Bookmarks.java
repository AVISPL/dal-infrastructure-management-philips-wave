/*
 * Copyright (c) 2023 AVI-SPL, Inc. All Rights Reserved.
 */
package com.avispl.symphony.dal.communicator.ppdswave.dto.display;

import com.avispl.symphony.dal.communicator.ppdswave.dto.ReportedDataWrapper;

/**
 * Device bookmarks details container
 *
 * @author Maksym.Rossiytsev
 * Created on 10/07/2023
 * @since 1.0.0
 * */
public class Bookmarks {
    private ReportedDataWrapper all;

    /**
     * Retrieves {@link #all}
     *
     * @return value of {@link #all}
     */
    public ReportedDataWrapper getAll() {
        return all;
    }

    /**
     * Sets {@link #all} value
     *
     * @param all new value of {@link #all}
     */
    public void setAll(ReportedDataWrapper all) {
        this.all = all;
    }
}
