package oop.test02;

public class Player {
   
   //속성
   String id;
   int atk,hp;
   Player target;

   Player(String _id,int _atk,int _hp){
      id = _id;
      setAtk(_atk);
      setHp(_hp);
      //생성자에서 target x
   }
   
   void setTarget(Player _target) {
      target = _target;
   }
   
   void setAtk(int _atk) {
      if(_atk < 0) {
         System.out.println("잘못된 공격력 설정 !");
         return;
      }
      atk = _atk;
   }
   
   void setHp(int _hp) {
      if(_hp < 0) {
         System.out.println("잘못된 체력 설정 !");
         return;
      }
      hp = _hp;
   }
   
   void attack() {
      target.hp -= atk; //target.hp - 상대방 피  atk - 내자신의 공격력
   }
   
   void disp() {
      System.out.println(id+"\t"+atk+"\t"+hp+"\t"+target.id);
   }
   
}