package com.metazion.jm.algo;

public abstract class LeaderboardTreeExtra {

	// 相同key时增删依据，用不变的唯一标识符比�?
	@Override
	public boolean equals(Object obj) {
		LeaderboardTreeExtra extra = (LeaderboardTreeExtra) obj;
		return this.compareTo(extra) == 0;
	}

	// 相同key时排序依据，负�?�则在前
	public abstract int compareTo(LeaderboardTreeExtra other);
}