package com.ychstudio.components;

import com.artemis.Component;

public class Enemy extends Component {

    public enum State {
        WALKING_UP,
        WALKING_DOWN,
        WALKING_LEFT,
        WALKING_RIGHT,
        ATTACKING_UP,
        ATTACKING_DOWN,
        ATTACKING_LEFT,
        ATTACKING_RIGHT,
        DYING;
        
        public static State getRandomWalkingState() {
            return values()[(int)(Math.random() * 4)];
        }
    }

    public State state;
    protected int hp;
    protected float speed;
    
    public Enemy(int hp) {
        this(hp, 2);
    }

    public Enemy(int hp, float speed) {
        state = State.getRandomWalkingState();
        this.hp = hp;
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    public void damage(int damage) {
        hp -= damage;
    }
    
    public float getSpeed() {
        return speed;
    }
    
    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
