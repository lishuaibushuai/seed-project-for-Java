package gameoflife;

import org.junit.Test;

import static org.junit.Assert.*;


/**
 * @Author: Lishuai
 * @Date: Created on 2018/11/17
 */
public class TestGameofLife {


    @Test
    public void gaven_cell_live_with_fewer_than_2_neighbors() {
        int[][] cells = new int[][]{
                {0, 0, 1},
                {0, 1, 0},
                {0, 0, 0}
        };

        assertNotEquals(1, GameOfLive.countLivingCells(cells, 1, 1));
    }

    @Test
    public void gaven_cell_live_with_more_than_3_neighbors() {
        int[][] cells = new int[][]{
                {1, 0, 1},
                {0, 1, 0},
                {1, 0, 1}
        };

        assertNotEquals(4, GameOfLive.countLivingCells(cells, 1, 1));
    }

    @Test
    public void gaven_cell_live_with_3_neighbors() {
        int[][] cells = new int[][]{
                {0, 0, 1},
                {0, 1, 0},
                {1, 0, 1}
        };

        assertEquals(3, GameOfLive.countLivingCells(cells, 1, 1));
    }

    @Test
    public void gaven_cell_die_with_3_neighbors() {
        int[][] cells = new int[][]{
                {0, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };

        assertEquals(3, GameOfLive.countLivingCells(cells, 1, 1));
    }

    @Test
    public void given_cells_output() {
        int[][] cells = new int[][]{
                {0, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };
        int[][] bigCells = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 0, 0, 0}
        };
        int[][] returnCells = new int[][]{
                {0, 0, 1},
                {0, 1, 0},
                {1, 0, 1}
        };
        assertSame(GameOfLive.cellLiveStatus(bigCells), returnCells);
    }
}
