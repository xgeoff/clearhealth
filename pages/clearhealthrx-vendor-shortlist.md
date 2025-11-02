---
title = "ClearHealthRx Vendor Shortlist"
---

## 🧾 CLEARHEALTHRX DISCOUNT NETWORK OPTIONS

| Vendor                       | Type                                                | Typical Setup Time      | Est. Cost               | Revenue Model                         | Pros                                                                     | Cons                                                            |
| ---------------------------- | --------------------------------------------------- | ----------------------- | ----------------------- | ------------------------------------- | ------------------------------------------------------------------------ | --------------------------------------------------------------- |
| **SingleCare (White-Label)** | Discount network aggregator                         | 4–6 weeks               | ~$0 upfront (rev-share) | You get small cut per fill ($0.50–$2) | Easy setup, national chain coverage (CVS, Walgreens, Walmart), solid API | Little control over pricing logic, no custom formulary          |
| **CleverRx**                 | White-label discount card                           | 4–6 weeks               | Free setup; co-branded  | Revenue share on transactions         | Offers branded portal + digital card; fully turnkey                      | Can’t customize pricing tiers deeply                            |
| **ProCare Rx**               | Transparent PBM / discount hybrid                   | 6–8 weeks               | ~$2 K–$5 K setup        | Transaction fees or shared savings    | Can create custom price formulas (e.g., NADAC + $2)                      | More complex contract; limited small-pharmacy coverage          |
| **SmithRx**                  | Transparent PBM                                     | 6–8 weeks               | ~$10 K–$25 K setup      | Admin fee per member per month (PMPM) | True PBM replacement: you can layer catastrophic coverage + analytics    | More infrastructure—better suited once you scale                |
| **Capital Rx**               | Enterprise transparent PBM                          | 8–12 weeks              | $25 K–$50 K+            | PMPM or % of savings                  | End-to-end adjudication, data, compliance handled                        | Overkill unless you plan 10 K+ members                          |
| **ParamountRx**              | Discount network, often co-brands with associations | 4–6 weeks               | $0                      | Revenue share                         | AARP-style partner model                                                 | Less tech customization; old-school marketing focus             |
| **ScriptCo**                 | Membership-based mail-order pharmacy                | 2–4 weeks (integration) | $0                      | Subscription ($140/yr)                | Can be your mail-order partner for non-Cost Plus fills                   | Limited formulary; no retail access                             |
| **GoodRx Pro / Gold**        | Discount network w/ API access                      | 4–8 weeks               | $0                      | Rev-share                             | Massive coverage; developer API                                          | Less transparent; spread pricing risk unless negotiated tightly |



## 🧩 Recommended Startup Combo

| Function                            | Recommended Vendor              | Why                                                          |
| ----------------------------------- | ------------------------------- | ------------------------------------------------------------ |
| **Default mail-order**              | Cost Plus Drugs                 | Transparent, low markup, predictable pricing                 |
| **Retail fallback (ClearHealthRx)** | **SingleCare** or **CleverRx**  | Fastest white-label setup, broad national coverage           |
| **Future upgrade path**             | **SmithRx**                     | When you reach ~5–10 K members and need data + claims engine |
| **Specialty / high-cost meds**      | **ProCareRx** or **Capital Rx** | Can handle specialty drugs + catastrophic pricing            |



## 🪙 Example Business Model for ClearHealthRx

* You earn **$1–$2 per fill** in revenue sharing from the partner.
* The member always sees **actual retail price before purchase** (no hidden rebates).
* You can **track utilization** via anonymized reports to improve Cost Plus coverage.
* Annual revenue per 1 000 active users ≈ **$5 000–$10 000**, mainly offsetting admin costs.



## ⚖️ Regulatory Checklist

| Requirement         | States Affected            | Notes                                                       |
| ------------------- | -------------------------- | ----------------------------------------------------------- |
| DMPO Registration   | TX, FL, IL, LA, TN, CO, MT | File a short registration form (~$300 fee)                  |
| HIPAA Data Handling | All                        | Handled by partner unless you store PHI                     |
| Consumer Disclosure | All                        | “This is not insurance” statement required on card and site |
| BIN/IIN Management  | N/A                        | Partner provides BIN through their switch (no extra fee)    |



## 🪪 Card Design Elements

**Front:** ClearHealthRx logo, BIN, PCN, Group ID, “Powered by [Partner] Network”
**Back:** “This is not insurance. Savings may vary. For support, call 1-800-XXX-XXXX.”
Add a QR code linking to a drug price lookup page (integrating Cost Plus + ClearHealthRx prices).


