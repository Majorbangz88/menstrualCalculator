package Data.Models;

import java.time.LocalDate;

public class MenstrualCycle {

    private LocalDate currentPeriodStartDate;
    private LocalDate currentPeriodEndDate;
    private int shortestCycleLength;
    private int longestCycleLength;
    private LocalDate safePeriodStartDate;
    private LocalDate safePeriodEndDate;
    private LocalDate ovulationPeriodStartDate;
    private LocalDate getOvulationPeriodEndDate;

    public LocalDate getCurrentPeriodStartDate() {
        return currentPeriodStartDate;
    }

    public void setCurrentPeriodStartDate(LocalDate currentPeriodStartDate) {
        this.currentPeriodStartDate = currentPeriodStartDate;
    }

    public LocalDate getCurrentPeriodEndDate() {
        return currentPeriodEndDate;
    }

    public void setCurrentPeriodEndDate(LocalDate currentPeriodEndDate) {
        this.currentPeriodEndDate = currentPeriodEndDate;
    }

    public int getShortestCycleLength() {
        return shortestCycleLength;
    }

    public void setShortestCycleLength(int shortestCycleLength) {
        this.shortestCycleLength = shortestCycleLength;
    }

    public int getLongestCycleLength() {
        return longestCycleLength;
    }

    public void setLongestCycleLength(int longestCycleLength) {
        this.longestCycleLength = longestCycleLength;
    }

    public LocalDate getSafePeriodStartDate() {
        return safePeriodStartDate;
    }

    public void setSafePeriodStartDate(LocalDate safePeriodStartDate) {
        this.safePeriodStartDate = safePeriodStartDate;
    }

    public LocalDate getSafePeriodEndDate() {
        return safePeriodEndDate;
    }

    public void setSafePeriodEndDate(LocalDate safePeriodEndDate) {
        this.safePeriodEndDate = safePeriodEndDate;
    }

    public LocalDate getOvulationPeriodStartDate() {
        return ovulationPeriodStartDate;
    }

    public void setOvulationPeriodStartDate(LocalDate ovulationPeriodStartDate) {
        this.ovulationPeriodStartDate = ovulationPeriodStartDate;
    }

    public LocalDate getGetOvulationPeriodEndDate() {
        return getOvulationPeriodEndDate;
    }

    public void setGetOvulationPeriodEndDate(LocalDate getOvulationPeriodEndDate) {
        this.getOvulationPeriodEndDate = getOvulationPeriodEndDate;
    }

    @Override
    public String toString() {
        return "MenstrualCycle{" +
                "currentPeriodStartDate=" + currentPeriodStartDate +
                ", currentPeriodEndDate=" + currentPeriodEndDate +
                ", shortestCycleLength=" + shortestCycleLength +
                ", longestCycleLength=" + longestCycleLength +
                ", safePeriodStartDate=" + safePeriodStartDate +
                ", safePeriodEndDate=" + safePeriodEndDate +
                ", ovulationPeriodStartDate=" + ovulationPeriodStartDate +
                ", getOvulationPeriodEndDate=" + getOvulationPeriodEndDate +
                '}';
    }
}
