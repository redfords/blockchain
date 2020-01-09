public class BlockChain {
   public static void main(String[] args) {
      Block firstBlock = new Block("This is the first block", "0");
      System.out.println("Hash for block 1 : " + firstBlock.hash);

      Block secondBlock = new Block("This is the second block", firstBlock.hash);
      System.out.println("Hash for block 2 :" + secondBlock.hash);

      Block thirdBlock = new Block("This is the third block", secondBlock.hash);
      System.out.println("Hash for block 3 : " + thirdBlock.hash);
   }
}

