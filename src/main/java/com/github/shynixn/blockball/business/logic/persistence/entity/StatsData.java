package com.github.shynixn.blockball.business.logic.persistence.entity;

import com.github.shynixn.blockball.api.persistence.entity.Stats;

/**
 * Copyright 2017 Shynixn
 * <p>
 * Do not remove this header!
 * <p>
 * Version 1.0
 * <p>
 * MIT License
 * <p>
 * Copyright (c) 2017
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
public class StatsData extends PersistenceObject implements Stats {

    private int amountWins;
    private int amountGames;
    private int amountGoals;
    private long playerId;

    /**
     * Returns the winRate of the player
     *
     * @return winRate
     */
    @Override
    public double getWinRate() {
        if (this.amountGames == 0)
            return 0;
        return ((double) this.amountWins) / ((double) this.amountGames);
    }

    /**
     * Returns the goals Per Game
     *
     * @return goalsPer Game
     */
    @Override
    public double getGoalsPerGame() {
        if (this.amountGames == 0)
            return 0;
        return ((double) this.amountGoals) / ((double) this.amountGames);
    }

    /**
     * Sets the amount of wins of the player
     *
     * @param amount amount
     */
    @Override
    public void setAmountOfWins(int amount) {
        this.amountWins = amount;
    }

    /**
     * Returns the amount of wins of the player
     *
     * @return amount amount
     */
    @Override
    public int getAmountOfWins() {
        return this.amountWins;
    }

    /**
     * Sets the amount of games played by the player
     *
     * @param amount amount
     */
    @Override
    public void setAmountOfGamesPlayed(int amount) {
        this.amountGames = amount;
    }

    /**
     * Returns the amount of games player by the player
     *
     * @return amount of game played
     */
    @Override
    public int getAmountOfGamesPlayed() {
        return this.amountGames;
    }

    /**
     * Sets the amount of goals of the player
     *
     * @param amount amount
     */
    @Override
    public void setAmountOfGoals(int amount) {
        this.amountGoals = amount;
    }

    /**
     * Returns the amount of goals of the player
     *
     * @return player
     */
    @Override
    public int getAmountOfGoals() {
        return this.amountGoals;
    }

    /**
     * Returns the playerId
     *
     * @return playerId
     */
    @Override
    public long getPlayerId() {
        return this.playerId;
    }

    /**
     * Sets the playerId
     *
     * @param id id
     */
    @Override
    public void setPlayerId(long id) {
        this.playerId = id;
    }
}
