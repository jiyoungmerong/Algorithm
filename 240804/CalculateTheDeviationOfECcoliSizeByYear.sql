/*
[문제 설명]
대장균들은 일정 주기로 분화하며, 분화를 시작한 개체를 부모 개체, 분화가 되어 나온 개체를 자식 개체라고 합니다.
다음은 실험실에서 배양한 대장균들의 정보를 담은 ECOLI_DATA 테이블입니다.
ECOLI_DATA 테이블의 구조는 다음과 같으며, ID, PARENT_ID, SIZE_OF_COLONY, DIFFERENTIATION_DATE, GENOTYPE 은
각각 대장균 개체의 ID, 부모 개체의 ID, 개체의 크기, 분화되어 나온 날짜, 개체의 형질을 나타냅니다.

Column name	            Type	    Nullable
ID	                    INTEGER	    FALSE
PARENT_ID	            INTEGER	    TRUE
SIZE_OF_COLONY	        INTEGER	    FALSE
DIFFERENTIATION_DATE	DATE	    FALSE
GENOTYPE	            INTEGER	FALSE

최초의 대장균 개체의 PARENT_ID 는 NULL 값입니다.
*/
SELECT YEAR(ED.DIFFERENTIATION_DATE) AS YEAR,
        (DD.SIZE-ED.SIZE_OF_COLONY) AS YEAR_DEV,
        ED.ID
FROM ECOLI_DATA AS ED
    LEFT JOIN (
        SELECT YEAR(DIFFERENTIATION_DATE) AS YEAR, max(SIZE_OF_COLONY) AS SIZE
        FROM ECOLI_DATA
        GROUP BY YEAR(DIFFERENTIATION_DATE)
    ) AS  DD
    ON YEAR(ED.DIFFERENTIATION_DATE) = DD.YEAR
ORDER BY YEAR, YEAR_DEV