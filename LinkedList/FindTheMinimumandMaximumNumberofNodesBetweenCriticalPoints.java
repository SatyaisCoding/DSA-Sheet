// This class is used to store information about critical points
// It holds both the node itself and its position (count) in the linked list
class Info {
  ListNode node;
  int count;

  public Info(ListNode node, int count) {
    this.node = node;
    this.count = count;
  }
}

class Solution {
  public int[] nodesBetweenCriticalPoints(ListNode head) {
    // Handle base cases: if list has less than 3 nodes, no critical points exist
    if (head == null || head.next == null || head.next.next == null) {
      return new int[]{-1, -1};
    }

    ListNode prev = head;
    ListNode curr = head.next;
    ListNode next = curr.next;
    int count = 1; // Keep track of node position (count)
    ArrayList<Info> criticalPoints = new ArrayList<>();

    // Traverse the linked list
    while (next != null) {
      count++;
      // Check if current node is a peak or valley (critical point)
      if ((curr.val > prev.val && curr.val > next.val) || (curr.val < prev.val && curr.val < next.val)) {
        criticalPoints.add(new Info(curr, count));
      }
      prev = curr;
      curr = next;
      next = next.next;
    }

    // Handle cases with no or only one critical point
    if (criticalPoints.size() <= 1) {
      return new int[]{-1, -1};
    }

    int minDistance = Integer.MAX_VALUE;
    // Find the minimum distance between critical points
    for (int i = 1; i < criticalPoints.size(); i++) {
      int distance = criticalPoints.get(i).count - criticalPoints.get(i - 1).count;
      minDistance = Math.min(minDistance, distance);
    }

    // Calculate the maximum distance between the first and last critical points
    int maxDistance = criticalPoints.get(criticalPoints.size() - 1).count - criticalPoints.get(0).count;

    return new int[]{minDistance, maxDistance};
  }
}
